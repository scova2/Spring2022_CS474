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
    private val bindingScoping: Map[String, Int] = Map("x"->2, "Adan"->10)

    def eval: BasicType =
      this match {
        case Value(i) => i
        case Var(name) => bindingScoping(name)
        case Add(op1, op2) => op1.eval + op2.eval
      }

  @main def runArithExp: Unit =
    import ArithExp.*
    val firstExpression = Add(Add(Value(2), Value(3)),Var("Adan")).eval
    println(firstExpression)
