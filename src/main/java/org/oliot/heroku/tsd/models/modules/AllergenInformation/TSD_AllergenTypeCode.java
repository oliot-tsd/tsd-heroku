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

package org.oliot.heroku.tsd.models.modules.AllergenInformation;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.Pattern;


@Getter
@RequiredArgsConstructor
public class TSD_AllergenTypeCode {
    /**
     * TODO: Find an efficient way or benchmark this!
     * @Pattern(regexp = "AA|AC|AE|AF|AH|AI|AL|AM|AN|AP|AS|AU|AW|AX|AY|BA|" +
     * "BB|BC|BE|BI|BM|BS|CA|CL|CN|CO|CT|EG|EP|EV|FA|GB|GE|GK|GO|GS|" +
     * "HC|HX|HY|ML|MO|NC|NE|NK|NL|NM|NP|NR|NW|SA|SC|SH|SM|SP|SQ|" +
     * "SR|ST|SW|TN|UM|UW|X99")
     *
     * AA: Refers to the presence of amylcinnamyl alcohol
     * AC: Refers to the presence of crustaceans and their derivatives in the product
     * AE: Refers to the presence of eggs and their derivatives in the product
     * AF: Refers to the presence of fish and their derivatives in the product
     * AH: Refers to the presence of anise alcohol
     * AI: Refers to the presence of alpha-Isomethyl Ionone
     * AL: Refers to the presence of amyl cinnamal
     * AM: Refers to the presence of milk and their derivatives in the product
     * AN: Refers to the presence of tree nuts and their derivatives in the product
     *      Tree nuts include brazil nuts, cashews, chestnuts,
     *      filberts/hazelnuts, macadamia nuts, pecans, pine nuts, pistachios, and walnuts.
     * AP: Refers to the presence of peanuts and their derivatives in the product
     * AS: Refers to the presence of sesame seeds or their derivatives in the product
     * AU: Refers to the presence of sulphur dioxide and sulphites in the product
     * AW: Refers to the presence of cereals containing gluten and their derivatives in the product
     * AX: Refers to the presense of other gluten containing grain and gluten containing grain products
     * AY: Refers to the presence of soybeans and their derivatives in the product
     * BA: Refers to the presence of benzyl alcohol
     * BB: Refers to the presence of benzyl benzoate
     * BC: Refers to the presence of celery or their derivatives in the product
     * BE: Refers to the presence of 2-(4-tert-Butylbenzyl) also known as Butylphenyl Methylpropional
     * BI: Refers to the presence of benzyl cinnamate
     * BM: Refers to the presence of mustard or their derivatives in the product
     * BS: Refers to the presence of benzyl salicylate
     * CA: Refers to the presence of cinnamyl alcohol
     * CL: Refers to the presence of cinnamal
     * CN: Refers to the presence of citronellol
     * CO: Refers to the presence of coumarin
     * CT: Refers to the presence of citral
     * EG: Refers to the presence of eugenol
     * EP: Refers to the presence of Oak moss extract (Evernia Prunastri)
     * EV: Refers to the presence of Treemoss extract (Evernia Furfuracea)
     * FA: Refers to the presence of farnesol
     * GB: Refers to the presence of barley and barley products (glutencontaining grain)
     * GE: Refers to the presence of geraniol
     * GK: Refers to the presence of kamut and kamut products (glutencontaining grain)
     * GO: Refers to the presence of oat and oat products (gluten containing grain)
     * GS: Refers to the presence of spelt and spelt products (gluten containing grain)
     * HC: Refers to the presence of Hydroxy-methylpentylcyclohexenecarboxaldehyde
     * HX: Refers to the presence of Hexyl Cinnamaldehyde
     * HY: Refers to the presence of hydroxycitronellal
     * ML: Refers to the presence of lactose
     * MO: Refers to the presence of 3 Methyl-4-(2,6,6-trimethyl-2-cyclohexen-1-yl)-3-buten-2-on
     * NC: Refers to the presence of cocoa and their derivatives in the product
     * NE: Refers to the presence of peas and pea products
     * NK: Refers to the presence of coriander and their derivatives in the product
     * NL: Refers to the presence of lupine and their derivatives in the product
     * NM: Refers to the presence of corn and their derivatives in the product
     * NP: Refers to the presence of pod fruits and their derivatives in the product
     * NR: Refers to the presence of rye and their derivatives in the product
     * NW: Refers to the presence of carrot and their derivatives in the product
     * SA: Refers to the presence of almond and almond products
     * SC: Refers to the presence of cashew and cashew products
     * SH: Refers to the presence of hazelnut and hazelnut products
     * SM: Refers to the presence of macadamia nut and macadamia nut products
     * SP: Refers to the presence of pecan nut and pecan nut products
     * SQ: Refers to the presence of queensland nut and queensland nut products
     * SR: Refers to the presence of brazil nut and brazil nut products
     * ST: Refers to the presence of pistachio and pistachio products
     * SW: Refers to the presence of walnut and walnut products
     * TN: Contains traces of tree nuts, i.e. almonds, various kinds of tree nuts
     * UM: Refers to the presence of molluscs and their derivatives in the product
     * UW: Refers to the presence of wheat and their derivatives in the product
     * X99: Does not contain declaration obligatory allergens
     */
    @Pattern(regexp = "[A-Z][A-Z]?\\d{2}")
    private final String value;
}