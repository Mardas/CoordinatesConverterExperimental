package convertes;

import converting_tools.CoordinatesFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AppServlet", urlPatterns = "/convert")
public class AppServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String inputPath = request.getParameter("inputPath");

        String outputhPath = request.getParameter("outputPath");

        String typeOfConversion = request.getParameter("coordinatesFormat");
        CoordinatesConventer coordinatesConventer = new CoordinatesConventer();

        if(typeOfConversion.equals("DDtoDMS")) {
            coordinatesConventer.convertCoordinates(inputPath, outputhPath, CoordinatesFormat.DDtoDMS);
            response.sendRedirect("convert.jsp");
        } else {
            coordinatesConventer.convertCoordinates(inputPath, outputhPath, CoordinatesFormat.DMStoDD);
            response.sendRedirect("convert.jsp");
        }




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
