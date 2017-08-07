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

package org.oliot.heroku.tsd.services;

import org.oliot.heroku.tsd.models.BasicProductInformationModule.ObjectFactory;
import org.oliot.heroku.tsd.models.BasicProductInformationModule.TSDBasicProductInformationModuleType;
import org.oliot.heroku.tsd.models.ProductDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.bind.*;
import java.io.StringReader;


class MyValidationEventHandler implements ValidationEventHandler {

    public boolean handleEvent(ValidationEvent event) {
        System.out.println("SEVERITY:  " + event.getSeverity());
        System.out.println("MESSAGE:  " + event.getMessage());
        System.out.println("LINKED EXCEPTION:  " + event.getLinkedException());
        System.out.println("LOCATOR");
        System.out.println("    LINE NUMBER:  " + event.getLocator().getLineNumber());
        System.out.println("    COLUMN NUMBER:  " + event.getLocator().getColumnNumber());
        System.out.println("    OFFSET:  " + event.getLocator().getOffset());
        System.out.println("    OBJECT:  " + event.getLocator().getObject());
        System.out.println("    NODE:  " + event.getLocator().getNode());
        System.out.println("    URL:  " + event.getLocator().getURL());
        return false;
    }
}

@Controller
public class HomeController {

    @Autowired
    private ProductDataRepository repository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/")
    public String insert(@RequestParam("editor") String xmldata) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            StringReader reader = new StringReader(xmldata);

            unmarshaller.setEventHandler(new MyValidationEventHandler());

            JAXBElement<TSDBasicProductInformationModuleType> jaxbElement
                    = (JAXBElement<TSDBasicProductInformationModuleType>) unmarshaller.unmarshal(reader);
            TSDBasicProductInformationModuleType tsdBasicProductInformationModuleType
                    = (TSDBasicProductInformationModuleType) jaxbElement.getValue();
            // repository.save(tsdProductDataType);

            tsdBasicProductInformationModuleType.getProductName().forEach(p -> System.out.println(p.getValue()));
            tsdBasicProductInformationModuleType.getImageLink().forEach(p -> System.out.println(p.getUrl()));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return "redirect:/";
    }
}