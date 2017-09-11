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

import org.oliot.heroku.tsd.models.ProductDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class ConsumerViewController {
    private ProductDataRepository repository;

    private static final Logger logger = LoggerFactory
            .getLogger(ConsumerViewController.class);

    @Autowired
    public ConsumerViewController(ProductDataRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/view/{gtin}")
    public String consumerView(@PathVariable String gtin) {
        logger.info("Requested GTIN: " + gtin);
        return "consumer";
    }
}
