/*
 * Copyright 2019 Ivo Woltring <WebMaster@ivonet.nl>
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

package nl.ivonet;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * Example of the classloader Type changing after Java 9+ and you will only notice this at runtime.
 */
public class JavaMagazineUrlClassLoader {
    public static void main(String[] args) {
        final JavaMagazineUrlClassLoader javaMagazineUrlClassLoader = new JavaMagazineUrlClassLoader();
        final ClassLoader classLoader = javaMagazineUrlClassLoader.getClass()
                                                                  .getClassLoader();
        URLClassLoader urlClassLoader = (URLClassLoader) classLoader;
        for (final URL url : urlClassLoader.getURLs()) {
            System.out.println("url = " + url);
        }
    }
}
