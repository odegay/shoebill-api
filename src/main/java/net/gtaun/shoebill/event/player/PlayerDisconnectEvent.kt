/**
 * Copyright (C) 2011 MK124

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.event.player

import net.gtaun.shoebill.`object`.Player
import net.gtaun.shoebill.constant.DisconnectReason

/**
 * This event represents the OnPlayerDisconnect of Pawn.
 *
 * @author MK124
 * @author Marvin Haschker
 * @see net.gtaun.shoebill.event.player.PlayerEvent
 * @see [OnPlayerDisconnect](https://wiki.sa-mp.com/wiki/OnPlayerDisconnect)
 */
class PlayerDisconnectEvent(player: Player,
                            /**
                             * The associated DisconnectReason for this event.
                             */
                            val reason: DisconnectReason) : PlayerEvent(player) {

    /**
     * The current response value
     */
    var response = 1
        private set

    /**
     * Disallows the further execution of this event in the whole abstract machine (also Pawn and other Plugins).
     */
    fun disallow() {
        this.response = this.response and 0
    }
}
