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
public class TSD_PartyContactRoleCode {
    /**
     * BRAND_OWNER: The organization that owns the specifications of the product
     *              regardless of where and by whom it is manufactured is normally
     *              responsible for the allocation of the Global Trade Item Number (GTIN).
     * DISTRIBUTOR: Party distributing goods, financial payments or documents.
     * EXPORTER: Party who makes - or on whose behalf a Customs clearing agent or other
     *           authorized person makes - an export declaration.
     *           This may include a manufacturer, seller or other person.
     *           Within a Customs union, consignor may have the same meaning as exporter
     * IMPORTER: Party who makes - or on whose behalf a Customs clearing agent or other
     *           authorized person makes - an import declaration.
     *           This may include a person who has possession of the goods
     *           or to whom the goods are consigned.
     * MANUFACTURER_OF_GOODS: Party who manufactures the goods.
     * MANUFACTURING_PLANT: A physical location consisting of one or more buildings
     *           with facilities for manufacturing.
     * REGISTERED_AGENT: The party having legal responsibility for the product in the
     *           target market for example a company to which market authorization has been issued.
     * WHOLESALER: Seller of articles, often in large quantities, to be retailed by others.
     * CXC: Consumer Support. The party which provides product support to the
     *      end user of a trade item or a service (GS1 Code)
     */
    @Pattern(regexp = "BRAND_OWNER|DISTRIBUTOR|EXPORTER|IMPORTER|" +
            "MANUFACTURER_OF_GOODS|MANUFACTURING_PLANT|REGISTERED_AGENT|" +
            "WHOLESALER|CXC", flags = Pattern.Flag.CASE_INSENSITIVE)
    private final String value;

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof TSD_PartyContactRoleCode)) {
            return false;
        }

        TSD_PartyContactRoleCode code = (TSD_PartyContactRoleCode) obj;

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
