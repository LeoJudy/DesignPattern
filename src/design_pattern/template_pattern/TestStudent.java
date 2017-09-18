package design_pattern.template_pattern;

class TestStudent1 extends TestPaper{

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    String getAnswer1() {
        return "a";
    }

    @Override
    String getAnswer2() {
        return "a";
    }

    @Override
    String getAnswer3() {
        return "a";
    }
}

class TestStudent2 extends TestPaper{

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    String getAnswer1() {
        return "a";
    }

    @Override
    String getAnswer2() {
        return "b";
    }

    @Override
    String getAnswer3() {
        return "c";
    }
}

class TestStudent3 extends TestPaper{

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    String getAnswer1() {
        return "b";
    }

    @Override
    String getAnswer2() {
        return "c";
    }

    @Override
    String getAnswer3() {
        return "d";
    }
}
