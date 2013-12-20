/* Generated by JTB 1.4.7 */
package type.syntaxtree;

import type.visitor.IRetArguVisitor;
import type.visitor.IRetVisitor;
import type.visitor.IVoidArguVisitor;
import type.visitor.IVoidVisitor;

public class NodeOptional implements INode {

  public INode node;

  private static final long serialVersionUID = 147L;

  public NodeOptional() {
    node = null;
  }

  public NodeOptional(final INode n) {
    addNode(n);
  }

  public void addNode(final INode n) {
    if (node != null)
      throw new Error("Attempt to set optional node twice");
    node = n;
  }

  public boolean present() {
    return (node != null); }

  public <R, A> R accept(final IRetArguVisitor<R, A> vis, final A argu) {
    return vis.visit(this, argu);
  }

  public <R> R accept(final IRetVisitor<R> vis) {
    return vis.visit(this);
  }

  public <A> void accept(final IVoidArguVisitor<A> vis, final A argu) {
    vis.visit(this, argu);
  }

  public void accept(final IVoidVisitor vis) {
    vis.visit(this);
  }

}
