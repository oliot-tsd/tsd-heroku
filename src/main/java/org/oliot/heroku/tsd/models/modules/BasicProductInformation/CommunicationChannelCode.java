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
public class CommunicationChannelCode {
    /**
     * EMAIL: Creating/sending/receiving of unstructured free text messages
     *        or documents using computer network, a mini-computer or an
     *        attached modem and regular telephone line or other electronic transmission media.
     * SOCIAL_MEDIA: A social media address.
     * TELEFAX: Device used for transmitting and reproducing fixed graphic material (as printing)
     *          by means of signals over telephone lines or other electronic transmission media.
     * TELEPHONE: Voice/data transmission by telephone.
     * WEBSITE: The identification of a world wide web address.
     */
    @Pattern(regexp = "EMAIL|SOCIAL_MEDIA|TELEFAX|" +
            "TELEPHONE|WEBSITE", flags = Pattern.Flag.CASE_INSENSITIVE)
    private final String value;
}
