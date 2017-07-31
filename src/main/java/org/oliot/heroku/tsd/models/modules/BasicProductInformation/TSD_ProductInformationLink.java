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

package org.oliot.heroku.tsd.models.modules.BasicProductInformation;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.springframework.data.annotation.PersistenceConstructor;

import javax.validation.constraints.Size;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;


@Data
public class TSD_ProductInformationLink {
    /**
     * Uniform Resource Locator (URL) that references a World-Wide Web resource
     * providing information about the product.
     * The value of url SHALL be an absolute URL with or without a fragment identifier,
     * as specified in [RFC3986]; relative URL references SHALL NOT be used.
     */
    @Size(min = 1, max = 2500)
    private URI url;

    /**
     * Code specifying the type of product information available at the specified url.
     */
    private TSD_ProductInformationTypeCode productInformationTypeCode;

    /**
     * Language codes specifying the language(s) for which this URL applies,
     * or omitted if this URL applies to all languages
     */
    @Setter(AccessLevel.NONE)
    private List<String> languageCodes;

    @PersistenceConstructor
    public TSD_ProductInformationLink
            (URI url, TSD_ProductInformationTypeCode productInformationTypeCode) {
        this.url = url;
        this.productInformationTypeCode = productInformationTypeCode;
    }

    public TSD_ProductInformationLink
    addLanguageCode(String languageCode) {
        if (this.languageCodes == null) {
            this.languageCodes = new ArrayList<>();
        }
        this.languageCodes.add(languageCode);
        return this;
    }
}
