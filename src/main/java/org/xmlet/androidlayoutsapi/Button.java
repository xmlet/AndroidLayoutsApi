package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class Button<Z extends Element> implements CustomAttributeGroup<Button<Z>, Z>, TextGroup<Button<Z>, Z>, TextViewHierarchyInterface<Button<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Button(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementButton(this);
   }

   public Button(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementButton(this);
   }

   protected Button(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementButton(this);
      }

   }

   public Z __() {
      this.visitor.visitParentButton(this);
      return this.parent;
   }

   public final Button<Z> dynamic(Consumer<Button<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Button<Z> of(Consumer<Button<Z>> consumer) {
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
      return "button";
   }

   public final Button<Z> self() {
      return this;
   }
}
