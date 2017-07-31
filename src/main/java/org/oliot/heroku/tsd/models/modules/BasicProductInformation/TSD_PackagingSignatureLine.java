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
import java.util.ArrayList;
import java.util.List;


@Data
public class TSD_PackagingSignatureLine {
    /**
     * Code specifying the role of the party or contact.
     */
    private TSD_PartyContactRoleCode partyContactRoleCode;

    /**
     * The name of the party or contact expressed as text.
     */
    @Size(min = 1, max = 200)
    private String partyContactName;

    /**
     * The address associated with the party / contact type.
     * For example, in case of a contact type of CONSUMER_SUPPORT,
     * this could be the full company address as expressed
     * on the trade item packaging or label.
     */
    @Size(min = 1, max = 500)
    private String partyContactAddress;

    /**
     * The Global Location Number (GLN) is a structured Identification
     * of a physical location, legal or functional entity within an enterprise.
     * The GLN is the primary party identifier. Each party identified in the
     * trading relationship must have a primary party Identification.
     */
    @Size(min = 13, max = 13)
    private String gln;

    /**
     * Communication details for the party or contact.
     * MAY be repeated for different communication channel types.
     */
    @Setter(AccessLevel.NONE)
    private List<CommunicationChannel> communicationChannels;

    @PersistenceConstructor
    public TSD_PackagingSignatureLine
            (TSD_PartyContactRoleCode partyContactRoleCode) {
        this.partyContactRoleCode = partyContactRoleCode;
    }

    public TSD_PackagingSignatureLine
    addCommunicationChannel(CommunicationChannel channel) {
        if (this.communicationChannels == null) {
            this.communicationChannels = new ArrayList<>();
        }
        this.communicationChannels.add(channel);
        return this;
    }
}
