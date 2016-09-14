/*
 * Copyright 2016 Jin Kwon &lt;jinahya_at_gmail.com&gt;.
 *
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
 */
package com.github.jinahya.rfc4648;

/**
 *
 * @author Jin Kwon &lt;jinahya_at_gmail.com&gt;
 */
public class Base16 extends Base {

    private static final byte[] CHARACTERS = {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };

    private static final byte[] NUMBERS = numbers(CHARACTERS);

    private static final int BPC = bpc(CHARACTERS.length);

    private static final int BPW = bpw(CHARACTERS.length);

    private static final int CPW = cpw(CHARACTERS.length);

    public Base16() {
//        super(new byte[]{
//            '0', '1', '2', '3', '4', '5', '6', '7',
//            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}, false);
        super(CHARACTERS, NUMBERS, true, BPC, BPW, CPW);
    }
}
