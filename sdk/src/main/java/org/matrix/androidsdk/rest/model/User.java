/*
 * Copyright 2014 OpenMarket Ltd
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
package org.matrix.androidsdk.rest.model;

/**
 * Class representing a user.
 */
public class User {
    public static final String PRESENCE_ONLINE = "online";
    public static final String PRESENCE_UNAVAILABLE = "unavailable";
    public static final String PRESENCE_OFFLINE = "offline";
    public static final String PRESENCE_FREE_FOR_CHAT = "free_for_chat";
    public static final String PRESENCE_HIDDEN = "hidden";

    public String userId;
    public String displayname;
    public String avatarUrl;
    public String presence;
    public long lastActiveAgo;
    public String statusMsg;

    public User deepCopy() {
        User copy = new User();
        copy.userId = userId;
        copy.displayname = displayname;
        copy.avatarUrl = avatarUrl;
        copy.presence = presence;
        copy.lastActiveAgo = lastActiveAgo;
        copy.statusMsg = statusMsg;
        return copy;
    }
}
