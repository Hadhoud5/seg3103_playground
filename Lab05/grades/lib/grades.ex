defmodule Grades do
  @moduledoc """
  Grades keeps the contexts that define your domain
  and business logic.

  Contexts are also responsible for managing your data, regardless
  if it comes from the database, an external API or others.
  """
  def avg(component_mark) do
    avg_value =
    if Enum.count(component_mark) == 0 do
       0
    else
     Enum.sum(component_mark) / Enum.count(component_mark)
     end
     avg_value
   end

  def exam_avg(midterm,final) do
    avg_exams=(midterm+final)/2
    avg_exams
  end

   # failed_to_participate method

  def failed_to_participate(hmwk, exam, lab) do
    failed =
    if hmwk < 0.4 || exam < 0.4 || lab < 3 do
      true
    else
      false
    end
    failed
  end

  def calculate_grade(avg_labs,avg_homework,midterm,final) do
    mark = 0.2 * avg_labs + 0.3 * avg_homework + 0.2 * midterm + 0.3 * final
    mark
   end

  def amt_labs(labs) do
   labs
      |> Enum.reject(fn mark -> mark < 0.25 end)
      |> Enum.count()
    end
  
  def percentage_grade(marks) do 
    #Randomly select a % from 0 to 100
    :rand.uniform(100)
  end

  def letter_grade(marks) do
    #First I created a list of letter grades
    list=['A+','A','A-','B+','B','C+','C','B+','B','C+','C','D+','D','EIN']
    #This function will now randomly take 1 of the items on the list as the output
    :Enum.take_random(list,1)
  end
  def numeric_grade(marks) do
    #similair ro percentage grade except now we're on a scale of 10 assuming
    # numeric grades go from 0-10
    :rand.uniform(10)
  end
end
