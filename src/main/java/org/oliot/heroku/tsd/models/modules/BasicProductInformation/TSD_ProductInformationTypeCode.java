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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.Pattern;


@Getter
@RequiredArgsConstructor
public class TSD_ProductInformationTypeCode {
    /**
     * AUDIO: Link to a file containing an audio clip which is relevant to the product.
     *        Examples are commercials, or instructional/how to use audio files.
     * CONSUMER_HANDLING_AND_STORAGE: Link to website, file, or image containing
     *        the Manufacturer's recommendations for how the consumer or end user
     *        should store and handle the product.
     * DOCUMENT: Link to a document or text file containing product information.
     *        Examples of this type could be an instruction manual,
     *        assembly guide, or warranty document.
     * IFU: Link to a file containing the Instructions For Use (IFU).
     *      This type of file is primarily used in conjunction with ingestible products,
     *      regardless of species.
     * MARKETING_INFORMATION: Link to a file with product information associated with
     *      selling a product or service.
     * OTHER_EXTERNAL_INFORMATION: Link to a file containing product information
     *      of an unspecified type.
     * VIDEO: Link to a file containing a video clip which is relevant to the product.
     *        Examples are commercials, trailers, or instructional/how to use video files.
     * WARRANTY_INFORMATION: Link to a file with information associated with any
     *        guarantee given by a company stating that a product is reliable and free
     *        from known defects and that the seller will, without charge, repair or
     *        replace defective parts within a given time limit ad under certain conditions.
     * WEBSITE: Link to a website containing product or manufacturer information.
     */
    @Pattern(regexp = "AUDIO|CONSUMER_HANDLING_AND_STORAGE|" +
            "DOCUMENT|IFU|MARKETING_INFORMATION|OTHER_EXTERNAL_INFORMATION" +
            "|VIDEO|WARRANTY_INFORMATION|WEBSITE", flags = Pattern.Flag.CASE_INSENSITIVE)
    private final String value;

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof TSD_ProductInformationTypeCode)) {
            return false;
        }

        TSD_ProductInformationTypeCode code = (TSD_ProductInformationTypeCode) obj;

        return new EqualsBuilder()
                .append(value, code.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(value)
                .toHashCode();
    }
}
