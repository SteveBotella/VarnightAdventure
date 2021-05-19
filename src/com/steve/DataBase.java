package com.steve;

import actors.Character;

import java.sql.*;

public class DataBase {

    Connection con;
    Statement statement;
    ResultSet resultset;

    public DataBase() {
        try {
            this.con = DriverManager.getConnection("jdbc:mariadb://localhost:3307/varnight", "root", "");
            this.statement = con.createStatement();
            this.resultset = null;
        }
        catch (Exception e) {
            System.out.println("There's nothing around here");
        }
    }

    public void showAllHeroes() {
        try {
            resultset = statement.executeQuery("SELECT * FROM players");
            while (resultset.next()) {
                System.out.println(resultset.getString(3) + " " + resultset.getString(2));
            }
        }
        catch (SQLException e) {
            System.out.println("There's nothing around here");
        }
    }

    public void saveHero(Character player) {
        try {
                statement.executeUpdate( "INSERT INTO players (archetype, name, ap) " +
                " VALUES ('" + player.getArchetype() + "', '" + player.getName() + "', '" + player.getAp() + "');",
                Statement.RETURN_GENERATED_KEYS);
        }
        catch (SQLException e) {
            System.out.println("There's nothing around here");
        }
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultset() {
        return resultset;
    }

    public void setResultset(ResultSet resultset) {
        this.resultset = resultset;
    }
}
