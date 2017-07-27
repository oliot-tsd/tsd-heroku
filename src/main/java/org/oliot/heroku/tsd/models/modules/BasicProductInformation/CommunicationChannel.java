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

import javax.validation.constraints.Size;


public class CommunicationChannel {
    /**
     * Code specifying the type of communication channel, for example TELEPHONE.
     */
    private CommunicationChannelCode communicationChannelCode;

    /**
     * The name of a specific communication channel for example Facebook, Twitter, etc.
     */
    @Size(min = 1, max = 200)
    private String communicationChannelName;

    /**
     * Text identifying the endpoint for the communication channel,
     * for example a telephone number or an e-mail address.
     */
    @Size(min = 1, max = 200)
    private String communicationChannelValue;

    public CommunicationChannel
            (CommunicationChannelCode code, String value) {
        this.communicationChannelCode = code;
        this.communicationChannelValue = value;
    }
}
