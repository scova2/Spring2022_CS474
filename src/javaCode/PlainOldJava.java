package javaCode;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

import java.util.Scanner;

public class PlainOldJava {

    public static void main(String[] args) {
        // LHS = RHS
        String myVarName = "Howdy from Java!";
        //store value "Howdy from Java!" into 0xdeadbeef
        System.out.println(myVarName);
        Integer y = 3;
        Integer z = 5;
        Integer x = y + z;
//        Integer x = y.add(z);
//        Integer x = (+ y z);

        //late binding
        //Integer result = invokemethod(Scanner.in)
    }
}
