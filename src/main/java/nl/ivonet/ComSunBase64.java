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
// Note the sun.* package
import sun.misc.BASE64Encoder;

/**
 * This is an example of a class that will not be accessible anymore after java 9
 *
 * Java 1.8 only gives warnings
 * Java 9+ errors...
 */
public class ComSunBase64 {

    private static void getBase64EncodedString(String inputString) {
        String encodedString = new BASE64Encoder().encode(inputString.getBytes());
        System.out.println("encodedString = " + encodedString);
    }
    public static void main(String[] args) {
        getBase64EncodedString("IvoNet.nl");
    }
}
