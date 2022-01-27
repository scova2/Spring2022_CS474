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

object OurArithExpDSL:
  type BasicType = Int
  enum ArithExp:
    case Value(input: BasicType)
    case Var(name: String)
    case Add(op1: ArithExp, op2: ArithExp)


  @main def runArithExp: Unit =
    import ArithExp.*
    val firstExpression = Add(Add(Value(2), Value(3)),Var("x"))
    println(firstExpression)
