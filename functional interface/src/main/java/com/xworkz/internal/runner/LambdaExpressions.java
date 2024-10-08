package com.xworkz.internal.runner;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

public class LambdaExpressions {

				public static void main(String[] args) {
		

					Consumer<Boolean> consumer = (Boolean b) -> {
						System.out.println("accept of Consumer in runner:" + b);
						System.out.println();
					};
					consumer.accept(true);

					BiConsumer<Boolean, Integer> biConsumer = (Boolean boo, Integer in) -> {
						System.out.println("accept of BiConsumer in runner:" + boo + " " + in);
						System.out.println();
					};
					biConsumer.accept(true, 11);

					Supplier<String> supplier = () -> {
						System.out.println("get of Supplier in runner");
						return "food";
					};
					supplier.get();
					System.out.println();

					Function<Integer, String> function = (i) -> {
						System.out.println("apply of Function in runner:" + i);
						return "done";
					};
					function.apply(10);
					System.out.println();

					BiFunction<Integer,Integer,Integer> biFunction = (i) -> {
						System.out.println("apply of BiFunction in runner:" + i);
						return 0;
					};
					biFunction.apply(11,null);
					System.out.println();

					Predicate<Double> predicate = (d) -> {
						System.out.println("test of Predicate in runner:" + d);
						return false;
					};
					predicate.test(10.00);
					System.out.println();

					BiPredicate<Integer, Integer> biPredicate = (i, i1) -> {
						System.out.println("test of Predicate in runner:" + i + " " + i1);
						return false;
					};
					biPredicate.test(10, 11);
					System.out.println();

					UnaryOperator<String> unaryOperator = (s) -> {
						System.out.println("apply of UnaryOperator in runner:" + s);
						return "done";
					};
					unaryOperator.apply("no");
					System.out.println();

					BinaryOperator<String> binaryOperator = (s, s1) -> {
						System.out.println("apply of BinaryOperator in runner:" + s);
						return "yes";
					};
					binaryOperator.apply("add", "divide");
					System.out.println();

					IntConsumer intConsumer = (i) -> {
						System.out.println("apply of BinaryOperator in runner:" + i);
					};
					intConsumer.accept(0);
					System.out.println();

					IntSupplier intSupplier = () -> {
						System.out.println("getAsInt of IntSupplier in runner");
						return 0;
					};
					intSupplier.getAsInt();
					System.out.println();

					IntFunction<Boolean> intFunction = (i) -> {
						System.out.println("apply of IntFunction in runner:" + i);
						return true;
					};
					intFunction.apply(0);
					System.out.println();

					IntPredicate intPredicate = (i) -> {
						System.out.println("test of IntPredicate in runner:" + i);
						return false;
					};
					intPredicate.test(0);
					System.out.println();

					IntUnaryOperator intUnaryOperator = (i) -> {
						System.out.println("applyAsInt of IntUnaryOperator in runner:" + i);
						return 1;
					};
					intUnaryOperator.applyAsInt(0);
					System.out.println();

					IntBinaryOperator intBinaryOperator = (i, i1) -> {
						System.out.println("applyAsInt of IntUnaryOperator in runner:" + i + " " + i1);
						return 2;
					};
					intBinaryOperator.applyAsInt(10, 20);
					System.out.println();

					LongConsumer longConsumer = (l) -> {
						System.out.println("accept of LongConsumer in runner:" + l);

					};
					longConsumer.accept(10);
					System.out.println();

					LongSupplier longSupplier = () -> {
						System.out.println("getAsLong of LongSupplier in runner");
						return 10L;

					};
					longSupplier.getAsLong();
					System.out.println();

					LongFunction<Integer> longFunction = (l) -> {
						System.out.println("apply of LongFunction in runner:" + l);
						return 100;

					};
					longFunction.apply(10L);
					System.out.println();

					LongPredicate longPredicate = (l) -> {
						System.out.println("test of LongPredicate in runner:" + l);
						return true;
					};
					longPredicate.test(20000L);
					System.out.println();

					LongUnaryOperator longUnaryOperator = (l) -> {
						System.out.println("applyAsLong of LongUnaryOperator in runner:" + l);
						return 3000L;
					};
					longUnaryOperator.applyAsLong(100000L);
					System.out.println();

					LongBinaryOperator longBinaryOperator = (l, l1) -> {
						System.out.println("applyAsLong of LongUnaryOperator in runner:" + l + " " + l1);
						return 0;
					};
					longBinaryOperator.applyAsLong(11111L, 2222L);
					System.out.println();

					DoubleConsumer doubleConsumer = (d) -> {
						System.out.println("accept of DoubleConsumer in runner:" + d);

					};
					doubleConsumer.accept(100);
					System.out.println();

					DoubleSupplier doubleSupplier = () -> {
						System.out.println("getAsDouble of DoubleSupplier in runner");
						return 0;
					};
					doubleSupplier.getAsDouble();

					DoubleFunction<String> doubleFunction = (d) -> {
						System.out.println("apply of DoubleFunction in runner:" + d);
						return "process";
					};
					doubleFunction.apply(100);
					System.out.println();

					DoublePredicate doublePredicate = (d) -> {
						System.out.println("test of DoublePredicate in runner:" + d);
						return true;
					};
					doublePredicate.test(232);
					System.out.println();

					DoubleUnaryOperator doubleUnaryOperator = (d) -> {
						System.out.println("applyAsDouble of DoubleUnaryOperator in runner:" + d);
						return 22;
					};
					doubleUnaryOperator.applyAsDouble(11);
					System.out.println();

					DoubleBinaryOperator doubleBinaryOperator = (d, d1) -> {
						System.out.println("applyAsDouble of DoubleBinaryOperator in runner:" + d + "  " + d1);
						return 1;
					};
					doubleBinaryOperator.applyAsDouble(54, 90);
					System.out.println();

					ToIntFunction<String> toIntFunction = (s) -> {
						System.out.println("applyAsInt of ToIntFunction in runner:" + s);
						return 10;
					};
					toIntFunction.applyAsInt("process");
					System.out.println();

					ToDoubleFunction<Double> toDoubleFunction = (d) -> {
						System.out.println("applyAsDouble of ToDoubleFunction in runner:" + d);
						return 1;
					};
					toDoubleFunction.applyAsDouble(232.0);
					System.out.println();

					ToLongFunction<Integer> toLongFunction = (i) -> {
						System.out.println("applyAsLong of ToLongFunction in runner:" + i);
						return 1;
					};
					toLongFunction.applyAsLong(22);
					System.out.println();

					ToIntBiFunction<String, String> toIntBiFunction = (s, s1) -> {
						System.out.println("applyAsInt of ToIntBiFunction in runner:" + s + "  " + s1);
						return 2;
					};
					toIntBiFunction.applyAsInt("ten", "two");
					System.out.println();

					ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction = (i, i1) -> {
						System.out.println("applyAsDouble of ToDoubleBiFunction in runner:" + i + "  " + i1);
						return 2;
					};
					toDoubleBiFunction.applyAsDouble(33, 44);
					System.out.println();

					ToLongBiFunction<Integer, Integer> toLongBiFunction = (i, i1) -> {
						System.out.println("applyAsLong of ToLongBiFunction in runner:" + i + "  " + i1);
						return 3;
					};
					toLongBiFunction.applyAsLong(22, 44);
					System.out.println();

					ObjIntConsumer<Double> objIntConsumer = (d, i) -> {
						System.out.println("accept of ObjIntConsumer in runner:" + d + "  " + i);
					};
					objIntConsumer.accept(77., 9);
					System.out.println();

					ObjDoubleConsumer<String> objDoubleConsumer = (s, d) -> {
						System.out.println("accept of ObjDoubleConsumer in runner:" + s + "  " + d);

					};
					objDoubleConsumer.accept("number", 20);
					System.out.println();

					ObjLongConsumer<Integer> objLongConsumer = (i, l) -> {
						System.out.println("accept of ObjLongConsumer in runner:" + i + "  " + l);
					};
					objLongConsumer.accept(99, 775836L);
					System.out.println();

					IntToDoubleFunction intToDoubleFunction = (i) -> {
						System.out.println("applyAsDouble of IntToDoubleFunction in runner:" + i);
						return 5;
					};
					intToDoubleFunction.applyAsDouble(89);
					System.out.println();

					IntToLongFunction intToLongFunction = (i) -> {
						System.out.println("applyAsLong of IntToLongFunction in runner:" + i);
						return 9;
					};
					intToLongFunction.applyAsLong(34);
					System.out.println();

					DoubleToIntFunction doubleToIntFunction = (d) -> {
						System.out.println("applyAsInt of DoubleToIntFunction in runner:" + d);
						return 9;
					};
					doubleToIntFunction.applyAsInt(54);
					System.out.println();

					LongToIntFunction longToIntFunction = (l) -> {
						System.out.println("applyAsInt of LongToIntFunction in runner:" + l);
						return 99;
					};
					longToIntFunction.applyAsInt(8595L);
					System.out.println();

					DoubleToLongFunction doubleToLongFunction = (d) -> {
						System.out.println("applyAsLong of DoubleToLongFunction in runner:" + d);
						return 8;
					};
					doubleToLongFunction.applyAsLong(89);
					System.out.println();

					LongToDoubleFunction longToDoubleFunction = (l) -> {
						System.out.println("applyAsDouble of LongToDoubleFunction in runner:" + l);
						return 90;
					};
					longToDoubleFunction.applyAsDouble(9888);
					System.out.println();

				}
			

		

	


	}
