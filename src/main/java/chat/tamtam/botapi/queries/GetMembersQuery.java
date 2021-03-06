/*
 * ------------------------------------------------------------------------
 * TamTam chat Bot API
 * ------------------------------------------------------------------------
 * Copyright (C) 2018 Mail.Ru Group
 * ------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ------------------------------------------------------------------------
 */

package chat.tamtam.botapi.queries;

import chat.tamtam.botapi.client.TamTamClient;

import chat.tamtam.botapi.model.ChatMembersList;

public class GetMembersQuery extends TamTamQuery<ChatMembersList> { 
    private final QueryParam<Long> marker = new QueryParam<>("marker", this);
    private final QueryParam<Integer> count = new QueryParam<>("count", this);

    public GetMembersQuery(TamTamClient client, Long chatId) {
        super(client, substitute("/chats/{chatId}/members", chatId), null, ChatMembersList.class, Method.GET);
    }

    public GetMembersQuery marker(Long value) {
        this.marker.setValue(value);
        return this;
    }
    public GetMembersQuery count(Integer value) {
        this.count.setValue(value);
        return this;
    }
}
