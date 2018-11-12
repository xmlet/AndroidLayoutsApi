package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class TextSwitcher<Z extends Element> implements CustomAttributeGroup<TextSwitcher<Z>, Z>, TextGroup<TextSwitcher<Z>, Z>, ViewSwitcherHierarchyInterface<TextSwitcher<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public TextSwitcher(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTextSwitcher(this);
   }

   public TextSwitcher(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTextSwitcher(this);
   }

   protected TextSwitcher(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTextSwitcher(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTextSwitcher(this);
      return this.parent;
   }

   public final TextSwitcher<Z> dynamic(Consumer<TextSwitcher<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final TextSwitcher<Z> of(Consumer<TextSwitcher<Z>> consumer) {
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
      return "textSwitcher";
   }

   public final TextSwitcher<Z> self() {
      return this;
   }
}
