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

import org.oliot.heroku.tsd.models.common.LanguageCode;
import org.oliot.heroku.tsd.models.common.Measurement;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class TSD_ImageLink {
    /**
     * Uniform Resource Locator (URL) that references a World-Wide Web
     * resource providing a product image.
     * The value of url SHALL be an absolute URL without a fragment identifier,
     * as specified in [RFC3986]; relative URL references SHALL NOT be used.
     */
    @Size(min = 1, max = 2500)
    private URI url;

    /**
     * Code specifying the type of images available at the specified url.
     */
    private TSD_ImageTypeCode imageTypeCode;

    /**
     * Language codes specifying the language(s) for which this image applies,
     * or omitted if this image applies to all languages.
     */
    private List<LanguageCode> languageCodes;

    /**
     * The number of pixels along the vertical axis of the image.
     */
    @Min(value = 0)
    private Integer imagePixelHeight;

    /**
     * The number of pixels along the horizontal axis of the image.
     */
    @Min(value = 0)
    private Integer imagePixelWidth;

    /**
     * Measure of the size of the file, expressed as value and unit of measure code.
     * Example: 2 megabytes.
     */
    private Measurement fileSize;

    public TSD_ImageLink
            (URI url, TSD_ImageTypeCode code) {
        this.url = url;
        this.imageTypeCode = code;
    }

    public TSD_ImageLink
    addLanguageCode(LanguageCode code) {
        if (this.languageCodes == null) {
            this.languageCodes = new ArrayList<LanguageCode>();
        }
        this.languageCodes.add(code);
        return this;
    }
}