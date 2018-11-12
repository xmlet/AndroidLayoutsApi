package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class EditText<Z extends Element> implements CustomAttributeGroup<EditText<Z>, Z>, TextGroup<EditText<Z>, Z>, TextViewHierarchyInterface<EditText<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public EditText(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementEditText(this);
   }

   public EditText(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementEditText(this);
   }

   protected EditText(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementEditText(this);
      }

   }

   public Z __() {
      this.visitor.visitParentEditText(this);
      return this.parent;
   }

   public final EditText<Z> dynamic(Consumer<EditText<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final EditText<Z> of(Consumer<EditText<Z>> consumer) {
      consumer.accept(this);
      return this;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "editText";
   }

   public final EditText<Z> self() {
      return this;
   }
}
