/* Generated by JTB 1.4.7 */
package type.visitor;

import type.syntaxtree.*;

public interface IRetVisitor<R> {

  public R visit(final NodeChoice n);

  public R visit(final NodeList n);

  public R visit(final NodeListOptional n);

  public R visit(final NodeOptional n);

  public R visit(final NodeSequence n);

  public R visit(final NodeTCF n);

  public R visit(final NodeToken n);

  public R visit(final Goal n);

  public R visit(final MainClass n);

  public R visit(final TypeDeclaration n);

  public R visit(final ClassDeclaration n);

  public R visit(final ClassExtendsDeclaration n);

  public R visit(final VarDeclaration n);

  public R visit(final MethodDeclaration n);

  public R visit(final FormalParameterList n);

  public R visit(final FormalParameter n);

  public R visit(final FormalParameterRest n);

  public R visit(final Type n);

  public R visit(final ArrayType n);

  public R visit(final BooleanType n);

  public R visit(final IntegerType n);

  public R visit(final Statement n);

  public R visit(final Block n);

  public R visit(final AssignmentStatement n);

  public R visit(final ArrayAssignmentStatement n);

  public R visit(final IfStatement n);

  public R visit(final WhileStatement n);

  public R visit(final PrintStatement n);

  public R visit(final Expression n);

  public R visit(final AndExpression n);

  public R visit(final CompareExpression n);

  public R visit(final PlusExpression n);

  public R visit(final MinusExpression n);

  public R visit(final TimesExpression n);

  public R visit(final ArrayLookup n);

  public R visit(final ArrayLength n);

  public R visit(final MessageSend n);

  public R visit(final ExpressionList n);

  public R visit(final ExpressionRest n);

  public R visit(final PrimaryExpression n);

  public R visit(final IntegerLiteral n);

  public R visit(final TrueLiteral n);

  public R visit(final FalseLiteral n);

  public R visit(final Identifier n);

  public R visit(final ThisExpression n);

  public R visit(final ArrayAllocationExpression n);

  public R visit(final AllocationExpression n);

  public R visit(final NotExpression n);

  public R visit(final BracketExpression n);

}
