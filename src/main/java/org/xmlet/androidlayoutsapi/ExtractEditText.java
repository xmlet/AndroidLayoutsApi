package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class ExtractEditText<Z extends Element> implements CustomAttributeGroup<ExtractEditText<Z>, Z>, TextGroup<ExtractEditText<Z>, Z>, EditTextHierarchyInterface<ExtractEditText<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ExtractEditText(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementExtractEditText(this);
   }

   public ExtractEditText(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementExtractEditText(this);
   }

   protected ExtractEditText(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementExtractEditText(this);
      }

   }

   public Z __() {
      this.visitor.visitParentExtractEditText(this);
      return this.parent;
   }

   public final ExtractEditText<Z> dynamic(Consumer<ExtractEditText<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ExtractEditText<Z> of(Consumer<ExtractEditText<Z>> consumer) {
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
      return "extractEditText";
   }

   public final ExtractEditText<Z> self() {
      return this;
   }
}
