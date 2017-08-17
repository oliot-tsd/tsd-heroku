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

import org.oliot.heroku.tsd.models.schema.ObjectFactory;
import org.oliot.heroku.tsd.models.schema.TSDBasicProductInformationModuleType;
import org.oliot.heroku.tsd.services.ProductDataValidationEventHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.StringReader;


@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/")
    public String insert(@RequestParam("editor") String xmldata) {
        try {
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            File schemaFile = new File("src/main/resources/static/schema/tsd/BasicProductInformationModule.xsd");
            Schema schema = schemaFactory.newSchema(schemaFile);

            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            unmarshaller.setEventHandler(new ProductDataValidationEventHandler());
            unmarshaller.setSchema(schema);

            StringReader reader = new StringReader(xmldata);

            JAXBElement<TSDBasicProductInformationModuleType> jaxbElement
                    = (JAXBElement<TSDBasicProductInformationModuleType>) unmarshaller.unmarshal(reader);
            TSDBasicProductInformationModuleType tsdBasicProductInformationModuleType
                    = (TSDBasicProductInformationModuleType) jaxbElement.getValue();
            // repository.save(tsdProductDataType);

            tsdBasicProductInformationModuleType.getProductName().forEach(p -> System.out.println(p.getValue()));
            tsdBasicProductInformationModuleType.getImageLink().forEach(p -> System.out.println(p.getUrl()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "redirect:/";
    }
}