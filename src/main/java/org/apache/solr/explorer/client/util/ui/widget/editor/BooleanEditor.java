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

package org.apache.solr.explorer.client.util.ui.widget.editor;

import com.google.gwt.user.client.ui.CheckBox;

/**
 * @author Uri Boness
 */
public class BooleanEditor implements Editor<Boolean> {

    public final static EditorFactory<Boolean> FACTORY = new AbstractEditorFactory<Boolean>() {
        public BooleanEditor create() {
            return new BooleanEditor();
        }
    };

    private CheckBox checkBox;

    public BooleanEditor() {
        this(false);
    }

    public BooleanEditor(boolean defaultValue) {
        this(defaultValue, true);
    }

    public BooleanEditor(boolean defaultValue, boolean enabled) {
        checkBox = new CheckBox();
        checkBox.setValue(defaultValue);
        setEnabled(enabled);
    }

    public Boolean getValue() {
        return checkBox.getValue();
    }

    public void setValue(Boolean value) {
        checkBox.setValue(value);
    }

    public CheckBox getWidget() {
        return checkBox;
    }

    public void setEnabled(boolean enabled) {
        checkBox.setEnabled(enabled);
    }

    public boolean isEnabled() {
        return checkBox.isEnabled();
    }
}
