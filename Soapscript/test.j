.class public test
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;
.field private static apple I
.field private static apple I
.field private static orange I
.field private static apple F
.field private static orange F
.field private static oscarBaboon F
.field private static apple F
.field private static orange F
.field private static oscarBaboon F
.field private static oscarBaboon2 F
.field private static apple F
.field private static orange F
.field private static oscarBaboon F
.field private static oscarBaboon2 F
.field private static oscarBaboon3 F
.field private static apple I
.field private static orange I
.field private static oscarBaboon I
.field private static oscarBaboon2 I
.field private static oscarBaboon3 I
.field private static blend I

.method public static main([Ljava/lang/String;)V

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        test/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        test/_standardIn LPascalTextIn;

; varintapple=10

	ldc	10
	putstatic	test/apple ?

; varintorange=3

	ldc	3
	putstatic	test/orange ?

; varfloatoscarBaboon=1.0

	ldc	1.0
	putstatic	test/oscarBaboon ?

; varfloatoscarBaboon2=2.0

	ldc	2.0
	putstatic	test/oscarBaboon2 ?

; varfloatoscarBaboon3=oscarBaboon+oscarBaboon2

	fadd
	putstatic	test/oscarBaboon3 ?

; varintblend=apple+orange*orange

	imul
	????
	putstatic	test/blend ?

; 


	getstatic     test/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
