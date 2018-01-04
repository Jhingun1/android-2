package org.owntracks.android.ui.base.navigator;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/* Copyright 2016 Patrick Löwenstein
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. */
public class ActivityNavigator extends BaseNavigator {
    private final AppCompatActivity activity;

    public ActivityNavigator(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Override
    final AppCompatActivity getActivity() {
        return activity;
    }

}


