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

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.Pattern;


@Getter
@RequiredArgsConstructor
public class TSD_ImageTypeCode {
    /**
     * LOGO: Link to a file containing the Manufacturer or Brand Logo(s) associated with the product.
     * OUT_OF_PACKAGE_IMAGE: Link to an image of an item out of its packaging
     *       and, if necessary, assembled ready for use by the end user.
     *       This type of file is subject to the GDSN Product Image Specification Standard.
     * PRODUCT_IMAGE: Link to a file containing a visual representation of the product.
     * PRODUCT_LABEL_IMAGE: Link to a file containing a visual representation of the product label.
     */
    @Pattern(regexp = "LOGO|OUT_OF_PACKAGE_IMAGE|" +
            "PRODUCT_IMAGE|PRODUCT_LABEL_IMAGE", flags = Pattern.Flag.CASE_INSENSITIVE)
    private final String value;
}
