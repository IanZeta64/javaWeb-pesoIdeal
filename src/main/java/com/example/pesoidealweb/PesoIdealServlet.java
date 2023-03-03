package com.example.pesoidealweb;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "PesoIdealServlet", urlPatterns = "/peso-ideal")
public class PesoIdealServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sexo = req.getParameter("sexo");
        double altura = Double.parseDouble(req.getParameter("altura"));

        double pesoIdeal;
         if (sexo.equals("F")){
             pesoIdeal = ( 62.1 * altura) - 44.7;
         }else{
             pesoIdeal = ( 72.7 * altura) - 58;
         }

        req.setAttribute("pesoIdeal", String.format("%.2f ", pesoIdeal));
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

}

//    Criar uma classe chamada PesoIdelServlet que na sua execução recebe o sexo
//    ( com as opções “M” ou “F” para Masculino ou Feminino)
//    , a altura da pessoa e retorna na saída o peso ideal para a pessoa.
//        a.	Os cálculos para peso ideal de homem e mulher são os seguintes:
//        i.	Para homens = ( 72.7 * altura) - 58;
//        ii.	Para mulheres = ( 62.1 * altura) - 44.7;