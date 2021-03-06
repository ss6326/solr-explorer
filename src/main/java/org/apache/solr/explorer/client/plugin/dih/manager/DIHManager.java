/*
 * Copyright 2011 SearchWorkings.org
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

package org.apache.solr.explorer.client.plugin.dih.manager;

import com.google.gwt.user.client.rpc.AsyncCallback;
import org.apache.solr.explorer.client.plugin.dih.model.result.DIHResult;

/**
 * @author Uri Boness
 */
public interface DIHManager {

    void executeFullImport(AsyncCallback<DIHResult> callback);

    void executeDeltaImport(AsyncCallback<DIHResult> callback);

    void getStatus(AsyncCallback<DIHResult> callback);

    void reloadConfig(AsyncCallback<DIHResult> callback);

}
