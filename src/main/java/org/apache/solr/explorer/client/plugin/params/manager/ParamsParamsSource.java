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

package org.apache.solr.explorer.client.plugin.params.manager;

import org.apache.solr.explorer.client.core.manager.RequestParams;
import org.apache.solr.explorer.client.core.manager.solr.ParamsSource;
import org.apache.solr.explorer.client.core.manager.solr.admin.SolrCore;
import org.apache.solr.explorer.client.core.manager.solr.search.urlwriter.AbstractParamsSource;
import org.apache.solr.explorer.client.core.model.context.Context;
import org.apache.solr.explorer.client.plugin.params.model.ParamsContext;
import org.apache.solr.explorer.client.util.collection.Properties;
import org.gwtoolbox.ioc.core.client.annotation.Component;

import java.util.Map;

/**
 * @author Uri Boness
 */
@Component
public class ParamsParamsSource extends AbstractParamsSource<ParamsContext> {

    public ParamsParamsSource() {
        super("Params");
    }

    public Class<ParamsContext> getContextClass() {
        return ParamsContext.class;
    }

    public void addParams(RequestParams params, ParamsContext context, Properties hints) {
        for (Map.Entry<String, String> entry : context.getParams().entrySet()) {
            params.setParameter(entry.getKey(), entry.getValue());
        }
    }


}
