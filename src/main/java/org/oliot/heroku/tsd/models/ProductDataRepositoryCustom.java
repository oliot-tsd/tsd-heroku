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

import org.oliot.heroku.tsd.models.schema.*;

interface ProductDataRepositoryCustom {
    TSDBasicProductInformationModuleType getBasicProductInformation(String gtin);
    TSDProductAllergenInformationModuleType getProductAllergenInformation(String gtin);
    TSDProductClaimsAndEndorsementsModuleType getProductClaimsAndEndorsements(String gtin);
    TSDProductInstructionsModuleType getProductInstructions(String gtin);
    TSDProductQuantityInformationModuleType getProductQuantityInformation(String gtin);
    TSDProductOriginInformationModuleType getProductOriginInformation(String gtin);
    TSDFoodAndBeverageIngredientInformationModuleType getFoodAndBeverageIngredientInformation(String gtin);
    TSDFoodAndBeveragePreparationInformationModuleType getFoodAndBeveragePreparationInformation(String gtin);
    TSDNutritionalProductInformationModuleType getNutritionalProductInformation(String gtin);
}
