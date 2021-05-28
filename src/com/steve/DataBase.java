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
//TODO Prepared Statement
    public void saveCreateHero(Character player) {
        try {
                statement.executeUpdate( "INSERT INTO players (archetype, name, hp, maxHp, ap, maxAp, skillOne, skillTwo, skillThree, skillFour, gold, minGold) " +
                " VALUES ('" + player.getArchetype() + "', '" + player.getName() + "', '" + player.getHp() + "', '" + player.getMaxHp() + "', '" + player.getAp() + "', '" + player.getMaxAp() + "', '" + player.getSkillOne() + "', '" + player.getSkillTwo() + "', '" + player.getSkillThree() + "', '" + player.getSkillFour() + "', '" + player.getGold() + "', '" + player.getMinGold() + "');",
                Statement.RETURN_GENERATED_KEYS);
        }
        catch (SQLException e) {
            System.out.println("There's nothing around here");
        }
    }

    public void saveUpdateHero(Character player) {
        try {
            statement.executeUpdate( "UPDATE players SET archetype = '" + player.getArchetype() + "', hp = '" + player.getHp() + "', maxHp = '" + player.getMaxHp() + "', ap = '" + player.getAp() + "', maxAp = '" + player.getMaxAp() + "', skillOne = '" + player.getSkillOne() + "', skillTwo = '" + player.getSkillTwo() + "', skillThree = '" + player.getSkillThree() + "', skillFour = '" + player.getSkillFour() + "' WHERE name = '" + player.getName() + "'");
        }
        catch (SQLException e) {
            System.out.println("There's nothing around here");
        }
    }

    public void loadHero(Character player) {
        try {
            resultset = statement.executeQuery("SELECT '" + player.getName() + "' FROM players");
                player.setArchetype(resultset.getString("archetype"));
                player.setHp(resultset.getInt("hp"));
                player.setMaxHp(resultset.getInt("maxHp"));
                player.setAp(resultset.getInt("ap"));
                player.setMaxAp(resultset.getInt("maxAp"));
                player.getSkillOne().setName(resultset.getString("skillOne"));
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
