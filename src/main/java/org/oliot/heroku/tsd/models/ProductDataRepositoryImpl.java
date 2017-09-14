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

package org.oliot.heroku.tsd.models;

import org.apache.commons.lang3.StringUtils;
import org.oliot.heroku.tsd.models.schema.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import javax.xml.bind.JAXBElement;

class ProductDataRepositoryImpl implements ProductDataRepositoryCustom {

    private final MongoTemplate mongoTemplate;

    @Autowired
    public ProductDataRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public TSDBasicProductInformationModuleType getBasicProductInformation(String gtin) {
        return (TSDBasicProductInformationModuleType) getTSDModule(gtin,
                TSDBasicProductInformationModuleType.class);
    }

    @Override
    public TSDProductAllergenInformationModuleType getProductAllergenInformation(String gtin) {
        return (TSDProductAllergenInformationModuleType) getTSDModule(gtin,
                TSDProductAllergenInformationModuleType.class);
    }

    @Override
    public TSDProductClaimsAndEndorsementsModuleType getProductClaimsAndEndorsements(String gtin) {
        return (TSDProductClaimsAndEndorsementsModuleType) getTSDModule(gtin,
                TSDProductClaimsAndEndorsementsModuleType.class);
    }

    @Override
    public TSDProductInstructionsModuleType getProductInstructions(String gtin) {
        return (TSDProductInstructionsModuleType) getTSDModule(gtin,
                TSDProductInstructionsModuleType.class);
    }

    @Override
    public TSDProductQuantityInformationModuleType getProductQuantityInformation(String gtin) {
        return (TSDProductQuantityInformationModuleType) getTSDModule(gtin,
                TSDProductQuantityInformationModuleType.class);
    }

    @Override
    public TSDProductOriginInformationModuleType getProductOriginInformation(String gtin) {
        return (TSDProductOriginInformationModuleType) getTSDModule(gtin,
                TSDProductOriginInformationModuleType.class);
    }

    @Override
    public TSDFoodAndBeverageIngredientInformationModuleType getFoodAndBeverageIngredientInformation(String gtin) {
        return (TSDFoodAndBeverageIngredientInformationModuleType) getTSDModule(gtin,
                TSDFoodAndBeverageIngredientInformationModuleType.class);
    }

    @Override
    public TSDFoodAndBeveragePreparationInformationModuleType getFoodAndBeveragePreparationInformation(String gtin) {
        return (TSDFoodAndBeveragePreparationInformationModuleType) getTSDModule(gtin,
                TSDFoodAndBeveragePreparationInformationModuleType.class);
    }

    @Override
    public TSDNutritionalProductInformationModuleType getNutritionalProductInformation(String gtin) {
        return (TSDNutritionalProductInformationModuleType) getTSDModule(gtin,
                TSDNutritionalProductInformationModuleType.class);
    }

    private Object getTSDModule(String gtin, Class moduleClass) {
        Query query = new Query();
        String gtin14 = StringUtils.leftPad(gtin, 14, "0");

        query.addCriteria(Criteria.where("gtin").is(gtin14));

        TSDProductDataType tsdProductDataType = mongoTemplate.findOne(query, TSDProductDataType.class);
        for (TSDProductDataRecordType productDataRecordType: tsdProductDataType.getProductDataRecord()) {
            for (ExtensionType extensionType: productDataRecordType.getModule()) {
                for (Object object: extensionType.getAny()) {
                    JAXBElement jaxbElement = (JAXBElement)object;
                    if (jaxbElement.getDeclaredType() == moduleClass) {
                        return jaxbElement.getValue();
                    }
                }
            }
        }
        return null;
    }
}
