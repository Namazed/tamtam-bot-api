package chat.tamtam.api.requests.queries;

/*-
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

import chat.tamtam.api.requests.NewMessage;
import chat.tamtam.api.requests.results.SendMessageResult;

/**
 * @author alexandrchuprin
 */
public class SendMessageQuery extends TamTamQuery<SendMessageResult> {
    public SendMessageQuery(NewMessage newMessage) {
        super("/me/messages", newMessage, SendMessageResult.class, true);
    }
}
