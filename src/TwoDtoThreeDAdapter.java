class TwoDToThreeDAdapter implements ThreeDShape {
    private TwoDFigure twoDFigure;
    private double depth;

    public TwoDToThreeDAdapter(TwoDFigure twoDFigure, double depth) {
        this.twoDFigure = twoDFigure;
        this.depth = depth;
    }

    @Override
    public double calculateVolume() {
        return twoDFigure.calculateArea() * depth;
    }
}
