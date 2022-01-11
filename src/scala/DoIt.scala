package scala

/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object DoIt:
  val Environment: Map[String, Int] = Map("myVariableName" -> 92893)
  var myVariableName: String = "Howdy, CS474!"

  @main def runIt(): Unit =
    val newMap = Environment + ("x" -> 2)
    println(newMap)
    myVariableName = "Sergio"
    println(myVariableName)
