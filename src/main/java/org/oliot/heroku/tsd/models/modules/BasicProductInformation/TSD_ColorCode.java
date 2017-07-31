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
public class TSD_ColorCode {
    /**
     * NRF: National Retail Federation - Standard Colour & Size Codes
     *      This handbook provides guidelines for use in retailers' and vendors'
     *      merchandising and communications systems.
     * NCS: Natural Colour System is a national standard for colour in Sweden,
     *      Norway, Spain and South Africa, has extensive international distribution.
     *      http://www.ncscolour.com
     * IFPS: The International Federation for Produce Standards.
     *       IFPS is composed of national produce associations from around the globe.
     *       The long term objective of the federation is to improve the supply chain
     *       efficiency of the fresh produce industry through developing, implementing
     *       and managing harmonized international standards.
     *       http://www.ifpsglobal.com/ProductIdentification.aspx
     * PMS: The definitive international reference for selecting, specifying, matching
     *      and controlling ink colours. The PANTONE formula guide, a three-guide set
     *      consisting of 1,114 solid PANTONE Colours on coated, uncoated and matte stock,
     *      shows corresponding printing ink formulas for each colour, and the three-book
     *      set of solid chips provides coated, uncoated and matte perforated tear-out chips
     *      that can be used for quality control.
     * PPCS: Provides a comprehensive palette of more than 3,000 colours achievable in
     *       four-color (CMYK) process printing. The PANTONE solid to process guide compares
     *       a solid PANTONE Colour to the closest possible match in CMYK four-color process
     *       that can be achieved on a computer monitor, output device or printing press.
     *       Other PANTONE Colour Reference Guides for the graphic arts include metallic,
     *       pastels, tints, duotones, film and foil.
     * PHCS: A six-colour ultra high quality printing process, reproduces a dynamic range of
     *       more brilliant continuous-tone images and simulates brighter, more vivid colours
     *       than standard four-color process printing.
     * PTCS: A vital tool for designers in the apparel, home furnishings and interior design
     *       industries for selecting and specifying colour used in the manufacture of textiles
     *       and fashion. The System - consisting of 1,932 colours in cotton or paper format
     *       - is ideal for assembling creative palettes and conceptual colour schemes,
     *       and for providing colour communication and control in the manufacturing process.
     *       In January of 2001 Pantone Inc. included the NRF Colour Codes into
     *       the PANTONE TEXTILE Color System
     * BUYER: Assigned by Buyer
     * SELLER: Assigned by Seller
     * WWS: Waren Wirtschafts System. A colour code system used in Germany for the
     *      standardisation of colours within the fashion/apparel sector.
     * RAL: Farbsystem RAL colour system is an international colour standard for professional
     *      users of colours in industry, trade, architecture and design since 1927.
     *      RAL is an independent and neutral partner for industry and trade.
     *      http://www.ral.de.
     */
    @Pattern(regexp = "NRF|NCS|IFPS|PMS|PPCS|PHCS" +
            "|PTCS|BUYER|SELLER|WWS|RAL", flags = Pattern.Flag.CASE_INSENSITIVE)
    private final String value;

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof TSD_ColorCode)) {
            return false;
        }

        TSD_ColorCode code = (TSD_ColorCode) obj;

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
