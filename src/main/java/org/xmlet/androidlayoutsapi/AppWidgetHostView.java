package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class AppWidgetHostView<Z extends Element> implements CustomAttributeGroup<AppWidgetHostView<Z>, Z>, TextGroup<AppWidgetHostView<Z>, Z>, FrameLayoutHierarchyInterface<AppWidgetHostView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AppWidgetHostView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAppWidgetHostView(this);
   }

   public AppWidgetHostView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAppWidgetHostView(this);
   }

   protected AppWidgetHostView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAppWidgetHostView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAppWidgetHostView(this);
      return this.parent;
   }

   public final AppWidgetHostView<Z> dynamic(Consumer<AppWidgetHostView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AppWidgetHostView<Z> of(Consumer<AppWidgetHostView<Z>> consumer) {
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
      return "appWidgetHostView";
   }

   public final AppWidgetHostView<Z> self() {
      return this;
   }
}
