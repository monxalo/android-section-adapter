

Android Section Adapter
-----------------------

A simple android ListView adapter to use with [Cursor][2]s.

Usage
-----

Check out the sample app in `sample/` to see it in action.

The adapter expects the collection you pass to it to be already sorted by
the column you're grouping.

Download
--------

Download [the latest JAR][1] or grab via Maven:

```xml
<dependency>
  <groupId>com.github.monxalo</groupId>
  <artifactId>android-section-adapter</artifactId>
  <version>1.0.1</version>
</dependency>
```
or Gradle:
```groovy
compile 'com.github.monxalo:android-section-adapter:1.0.1@jar'
```

License
-------

    Copyright 2011 Gonçalo Ferreira

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

[1]: https://search.maven.org/remote_content?g=com.github.monxalo&a=android-section-adapter&v=LATEST
[2]: http://developer.android.com/reference/android/database/Cursor.html