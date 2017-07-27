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

import org.oliot.heroku.tsd.models.common.Description80;

import java.util.ArrayList;
import java.util.List;

//FIXME: This class is not compatible with GS1 TSD standard
//   Contact GS1 Source working group to point out the problems in TSD_Colour structure:
//     1. Cardinality of at-least one element should be 1
//     2. Value of TSD_ColourCode should be simple codes and not text strings (e.g. containing ® symbol)
public class TSD_Color {
    /**
     * A code depicting the colour of an object according to a specified code list.
     */
    private TSD_ColorCode colorCode;

    /**
     * A description of a colour of an object.
     */
    private List<Description80> colorDescription;

    public TSD_Color
            (TSD_ColorCode code) {
        this.colorCode = code;
    }

    public TSD_Color
    addColorDescription(Description80 description) {
        if (this.colorDescription == null) {
            this.colorDescription = new ArrayList<Description80>();
        }
        this.colorDescription.add(description);
        return this;
    }
}
