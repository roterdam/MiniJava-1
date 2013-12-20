/* Generated by JTB 1.4.7 */
package type.syntaxtree;

import type.visitor.IRetArguVisitor;
import type.visitor.IRetVisitor;
import type.visitor.IVoidArguVisitor;
import type.visitor.IVoidVisitor;

public interface INode extends java.io.Serializable {

  /** The OS line separator */
  public static final String LS = System.getProperty("line.separator");

  public <R, A> R accept(final IRetArguVisitor<R, A> vis, final A argu);

  public <R> R accept(final IRetVisitor<R> vis);

  public <A> void accept(final IVoidArguVisitor<A> vis, final A argu);

  public void accept(final IVoidVisitor vis);

}
