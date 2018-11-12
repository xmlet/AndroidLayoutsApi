package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class CalendarView<Z extends Element> implements CustomAttributeGroup<CalendarView<Z>, Z>, TextGroup<CalendarView<Z>, Z>, FrameLayoutHierarchyInterface<CalendarView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public CalendarView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementCalendarView(this);
   }

   public CalendarView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementCalendarView(this);
   }

   protected CalendarView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementCalendarView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentCalendarView(this);
      return this.parent;
   }

   public final CalendarView<Z> dynamic(Consumer<CalendarView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final CalendarView<Z> of(Consumer<CalendarView<Z>> consumer) {
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
      return "calendarView";
   }

   public final CalendarView<Z> self() {
      return this;
   }

   public final CalendarView<Z> attrDateTextAppearance(String attrDateTextAppearance) {
      this.visitor.visitAttributeDateTextAppearance(attrDateTextAppearance);
      return this;
   }

   public final CalendarView<Z> attrFirstDayOfWeek(String attrFirstDayOfWeek) {
      this.visitor.visitAttributeFirstDayOfWeek(attrFirstDayOfWeek);
      return this;
   }

   public final CalendarView<Z> attrFocusedMonthDateColor(String attrFocusedMonthDateColor) {
      this.visitor.visitAttributeFocusedMonthDateColor(attrFocusedMonthDateColor);
      return this;
   }

   public final CalendarView<Z> attrMaxDate(String attrMaxDate) {
      this.visitor.visitAttributeMaxDate(attrMaxDate);
      return this;
   }

   public final CalendarView<Z> attrMinDate(String attrMinDate) {
      this.visitor.visitAttributeMinDate(attrMinDate);
      return this;
   }

   public final CalendarView<Z> attrSelectedDateVerticalBar(String attrSelectedDateVerticalBar) {
      this.visitor.visitAttributeSelectedDateVerticalBar(attrSelectedDateVerticalBar);
      return this;
   }

   public final CalendarView<Z> attrSelectedWeekBackgroundColor(String attrSelectedWeekBackgroundColor) {
      this.visitor.visitAttributeSelectedWeekBackgroundColor(attrSelectedWeekBackgroundColor);
      return this;
   }

   public final CalendarView<Z> attrShowWeekNumber(String attrShowWeekNumber) {
      this.visitor.visitAttributeShowWeekNumber(attrShowWeekNumber);
      return this;
   }

   public final CalendarView<Z> attrShownWeekCount(String attrShownWeekCount) {
      this.visitor.visitAttributeShownWeekCount(attrShownWeekCount);
      return this;
   }

   public final CalendarView<Z> attrUnfocusedMonthDateColor(String attrUnfocusedMonthDateColor) {
      this.visitor.visitAttributeUnfocusedMonthDateColor(attrUnfocusedMonthDateColor);
      return this;
   }

   public final CalendarView<Z> attrWeekDayTextAppearance(String attrWeekDayTextAppearance) {
      this.visitor.visitAttributeWeekDayTextAppearance(attrWeekDayTextAppearance);
      return this;
   }

   public final CalendarView<Z> attrWeekNumberColor(String attrWeekNumberColor) {
      this.visitor.visitAttributeWeekNumberColor(attrWeekNumberColor);
      return this;
   }

   public final CalendarView<Z> attrWeekSeparatorLineColor(String attrWeekSeparatorLineColor) {
      this.visitor.visitAttributeWeekSeparatorLineColor(attrWeekSeparatorLineColor);
      return this;
   }
}
