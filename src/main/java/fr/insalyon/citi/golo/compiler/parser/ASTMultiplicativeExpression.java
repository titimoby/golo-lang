/*
 * Copyright 2012-2015 Institut National des Sciences Appliquées de Lyon (INSA-Lyon)
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

package fr.insalyon.citi.golo.compiler.parser;

import java.util.ArrayList;
import java.util.List;

public class ASTMultiplicativeExpression extends GoloASTNode {

  private final List<String> operators = new ArrayList<>();

  public ASTMultiplicativeExpression(int id) {
    super(id);
  }

  public ASTMultiplicativeExpression(GoloParser p, int id) {
    super(p, id);
  }

  @Override
  public Object jjtAccept(GoloParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  public List<String> getOperators() {
    return operators;
  }

  public void addOperator(String symbol) {
    operators.add(symbol);
  }

  @Override
  public String toString() {
    return "ASTMultiplicativeExpression{" +
        "operators=" + operators +
        '}';
  }
}
