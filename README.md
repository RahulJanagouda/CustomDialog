# PrettyDialog
============
An elegant dialog with a close button.

# Screenshot
============

![demo_screen](https://raw.githubusercontent.com/RahulJanagouda/CustomDialog/master/Screenshot/demo.gif)

# Download
============
Maven
```xml
<dependency>
  <groupId>com.rahuljanagouda</groupId>
  <artifactId>prettydialog</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

Gradle
```
compile 'com.rahuljanagouda:prettydialog:1.0.0'
```

# Example
============
```Java
LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
View dialogView = inflater.inflate(R.layout.test_layout,null);

TextView clickText = (TextView) dialogView.findViewById(R.id.click_me);
    clickText.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You Clicked the click",Toast.LENGTH_SHORT).show();
        }
    });

FragmentManager fm = getSupportFragmentManager();
PrettyDialog pd = PrettyDialog.newInstance(dialogView);
pd.show(fm,"Testing");
```

# License
============

    Copyright 2016 Rahul Janagouda

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


