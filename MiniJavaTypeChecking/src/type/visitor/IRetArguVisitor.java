/* Generated by JTB 1.4.7 */
package type.visitor;

import type.syntaxtree.*;

public interface IRetArguVisitor<R, A> {

  public R visit(final NodeChoice n, final A argu);

  public R visit(final NodeList n, final A argu);

  public R visit(final NodeListOptional n, final A argu);

  public R visit(final NodeOptional n, final A argu);

  public R visit(final NodeSequence n, final A argu);

  public R visit(final NodeTCF n, final A argu);

  public R visit(final NodeToken n, final A argu);

  public R visit(final Goal n, final A argu);

  public R visit(final MainClass n, final A argu);

  public R visit(final TypeDeclaration n, final A argu);

  public R visit(final ClassDeclaration n, final A argu);

  public R visit(final ClassExtendsDeclaration n, final A argu);

  public R visit(final VarDeclaration n, final A argu);

  public R visit(final MethodDeclaration n, final A argu);

  public R visit(final FormalParameterList n, final A argu);

  public R visit(final FormalParameter n, final A argu);

  public R visit(final FormalParameterRest n, final A argu);

  public R visit(final Type n, final A argu);

  public R visit(final ArrayType n, final A argu);

  public R visit(final BooleanType n, final A argu);

  public R visit(final IntegerType n, final A argu);

  public R visit(final Statement n, final A argu);

  public R visit(final Block n, final A argu);

  public R visit(final AssignmentStatement n, final A argu);

  public R visit(final ArrayAssignmentStatement n, final A argu);

  public R visit(final IfStatement n, final A argu);

  public R visit(final WhileStatement n, final A argu);

  public R visit(final PrintStatement n, final A argu);

  public R visit(final Expression n, final A argu);

  public R visit(final AndExpression n, final A argu);

  public R visit(final CompareExpression n, final A argu);

  public R visit(final PlusExpression n, final A argu);

  public R visit(final MinusExpression n, final A argu);

  public R visit(final TimesExpression n, final A argu);

  public R visit(final ArrayLookup n, final A argu);

  public R visit(final ArrayLength n, final A argu);

  public R visit(final MessageSend n, final A argu);

  public R visit(final ExpressionList n, final A argu);

  public R visit(final ExpressionRest n, final A argu);

  public R visit(final PrimaryExpression n, final A argu);

  public R visit(final IntegerLiteral n, final A argu);

  public R visit(final TrueLiteral n, final A argu);

  public R visit(final FalseLiteral n, final A argu);

  public R visit(final Identifier n, final A argu);

  public R visit(final ThisExpression n, final A argu);

  public R visit(final ArrayAllocationExpression n, final A argu);

  public R visit(final AllocationExpression n, final A argu);

  public R visit(final NotExpression n, final A argu);

  public R visit(final BracketExpression n, final A argu);

}
