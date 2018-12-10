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

import org.oliot.heroku.tsd.exceptions.BadRequestException;
import org.oliot.heroku.tsd.models.ProductDataRepository;
import org.oliot.heroku.tsd.models.schema.ObjectFactory;
import org.oliot.heroku.tsd.models.schema.TSDProductDataType;
import org.oliot.heroku.tsd.services.ProductDataValidationEventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;


@Controller
public class HomeController {

    private ProductDataRepository repository;

    private static final Logger logger = LoggerFactory
            .getLogger(HomeController.class);

    @Autowired
    public HomeController(ProductDataRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/insert")
    public ResponseEntity<?> insert(@RequestParam("editor") String xmldata) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            unmarshaller.setEventHandler(new ProductDataValidationEventHandler());

            StringReader reader = new StringReader(xmldata);

            JAXBElement<TSDProductDataType> jaxbElement
                    = (JAXBElement<TSDProductDataType>) unmarshaller.unmarshal(reader);
            TSDProductDataType tsdProductDataType = jaxbElement.getValue();

            logger.info("Adding resource: " + tsdProductDataType.getEpcURI());

            repository.save(tsdProductDataType);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BadRequestException();
        }

        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }

    @PostMapping("/reset")
    public ResponseEntity<?> reset() {
        repository.deleteAll();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);
    }
}