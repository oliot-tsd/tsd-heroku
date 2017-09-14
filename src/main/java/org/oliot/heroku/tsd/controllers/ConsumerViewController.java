/*
 * Copyright 2017 Open Language for Internet of Things (Oliot)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.oliot.heroku.tsd.controllers;

import com.cloudinary.Cloudinary;
import com.cloudinary.Singleton;
import org.apache.commons.lang3.StringUtils;
import org.oliot.heroku.tsd.exceptions.ResourceNotFoundException;
import org.oliot.heroku.tsd.models.ProductDataRepository;
import org.oliot.heroku.tsd.models.schema.TSDProductDataType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class ConsumerViewController {
    private ProductDataRepository repository;

    private static final Logger logger = LoggerFactory
            .getLogger(ConsumerViewController.class);
    private static final Cloudinary cloudinary = Singleton
            .getCloudinary();

    @Autowired
    public ConsumerViewController(ProductDataRepository repository) {
        this.repository = repository;
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public String handleResourceNotFoundException(Model model) {
        model.addAttribute("errorMessage", "Product not found in database!");
        return "404";
    }

    @GetMapping("/view/{gtin}")
    public String consumerView(@PathVariable String gtin, Model model) {
        TSDProductDataType tsdProductDataType;

        String gtin14 = StringUtils.leftPad(gtin, 14, "0");
        logger.info("Requested GTIN: " + gtin14);

        tsdProductDataType = repository.queryByGtin(gtin14);
        if (tsdProductDataType != null) {
            model.addAttribute("cloudinaryName", cloudinary.getStringConfig("cloud_name", ""));
            model.addAttribute("productData", tsdProductDataType);
            return "consumer/index";
        } else {
            throw new ResourceNotFoundException();
        }
    }
}
